package alex.mrrok.presentation.base.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import alex.mrrok.domain.entity.domainmodel.DomainModel;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public abstract class BaseRecyclerViewAdapter<Entity extends DomainModel,
        VM extends BaseItemViewModel<Entity>>
        extends RecyclerView.Adapter<BaseItemViewHolder<Entity, VM, ?>> {

    private boolean isItemClickedEnabled = true;
    private PublishSubject<ClickedItemModel> itemClickSubject = PublishSubject.create();

    private List<Entity> items = new ArrayList<>();

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder<Entity, VM, ?> holder, int position) {
        holder.bintTo(items.get(position), position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onViewAttachedToWindow(@NonNull BaseItemViewHolder<Entity, VM, ?> holder) {
        super.onViewAttachedToWindow(holder);

        if (isItemClickedEnabled) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder.getAdapterPosition();
                    itemClickSubject.onNext(new ClickedItemModel(items.get(position), position));
                    holder.getViewModel().onItemClik();
                }
            });

        }
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull BaseItemViewHolder<Entity, VM, ?> holder) {
        super.onViewDetachedFromWindow(holder);
        if (isItemClickedEnabled) {
            holder.itemView.setOnClickListener(null);
        }
    }

    public Observable<ClickedItemModel> observeItemClick() {
        return itemClickSubject;
    }

    public void setItems(List<Entity> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public void removeItem(Entity entity) {
        int index = this.items.indexOf(entity);
        this.items.remove(index);
        notifyItemRemoved(index);
    }

    public void moveItem(int fromPosition, int toPosition) {
        //Entity item = items.get(fromPosition);
        Entity item = items.remove(fromPosition);
        if (toPosition > fromPosition) {
            toPosition--;
        }
        items.add(toPosition, item);
        notifyItemMoved(fromPosition, toPosition);
    }

    public void addItem(Entity entity) {
        items.add(entity);
        notifyItemInserted(items.size() - 1);
    }

    public void addItems(List<Entity> items) {
        this.items.addAll(items);
        notifyItemRangeInserted(items.size() - 1, items.size());
    }

    public void clear() {
        this.items.clear();
        notifyDataSetChanged();
    }

}
