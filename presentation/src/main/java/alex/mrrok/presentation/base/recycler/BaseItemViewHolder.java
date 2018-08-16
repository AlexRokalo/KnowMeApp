package alex.mrrok.presentation.base.recycler;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import alex.mrrok.domain.entity.domainmodel.DomainModel;
import alex.mrrok.knowmeapp.BR;

public class BaseItemViewHolder<Entity extends DomainModel,
        VM extends BaseItemViewModel<Entity>,
        B extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private VM viewModel;
    private B binding;

    public BaseItemViewHolder(VM viewModel, B binding) {
        super(binding.getRoot());
        this.viewModel = viewModel;
        this.binding = binding;

        binding.setVariable(BR.viewModel,viewModel);
    }

    public void bintTo(Entity entity,int position){
        viewModel.setItem(entity,position);
        binding.executePendingBindings();
    }

    public VM getViewModel() { return viewModel;}
}
