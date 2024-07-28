package org.example;

public class Doubleton
{
    private static final int MAX_INSTANCES = 2;
    private static Doubleton[] instances = new Doubleton[MAX_INSTANCES];
    private static int instanceCount = 0;

    private Doubleton() {}

    public static Doubleton getInstance()
    {
        if (instanceCount < MAX_INSTANCES)
        {
            synchronized (Doubleton.class)
            {
                if (instanceCount < MAX_INSTANCES)
                {
                    Doubleton newInstance = new Doubleton();
                    instances[instanceCount] = newInstance;
                    instanceCount++;
                    return newInstance;
                }
            }
        }
        // If maximum instances reached, return one of the existing instances
        return instances[(int) (Math.random() * MAX_INSTANCES)];
    }
}

