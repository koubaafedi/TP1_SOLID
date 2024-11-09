package exercise_refactored;

public class TimeSlotResource implements Resource
{
    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate()
    {
        int resourceId = isFree();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markTimeSlotFree(resourceId);
    }

    public int isFree()
    {
        return 0; 
    }

    private void markTimeSlotBusy(int resourceId)
    {
    }

    private void markTimeSlotFree(int resourceId)
    {
    }
}
