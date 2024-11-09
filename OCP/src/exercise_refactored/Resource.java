package exercise_refactored;

public interface Resource
{
    int allocate();
    void free(int resourceId);
    int isFree();
}
