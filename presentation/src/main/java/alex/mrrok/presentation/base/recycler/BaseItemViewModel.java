package alex.mrrok.presentation.base.recycler;

import alex.mrrok.domain.entity.domainmodel.DomainModel;


// Entity то что приходит из DomainModel
public abstract class BaseItemViewModel<Entity extends DomainModel> {

    public abstract void setItem(Entity entity, int position);

    public void onItemClik(){

    }
}
