package alex.mrrok.presentation.base.recycler;

import alex.mrrok.domain.entity.domainmodel.DomainModel;

public class ClickedItemModel<Entity extends DomainModel> {

    private Entity entity;
    private int position;

    public ClickedItemModel(Entity entity, int position) {
        this.entity = entity;
        this.position = position;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getPosition() {
        return position;
    }
}
