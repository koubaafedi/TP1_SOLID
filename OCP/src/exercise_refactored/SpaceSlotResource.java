package exercise_refactored;

public class SpaceSlotResource implements Resource
{
    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate()
    {
        int resourceId = isFree();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markSpaceSlotFree(resourceId);
    }

    public int isFree()
    {
        return 0; 
    }

    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private void markSpaceSlotFree(int resourceId)
    {
    }
}
