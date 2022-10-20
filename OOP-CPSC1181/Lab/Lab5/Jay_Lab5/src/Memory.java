import java.util.ArrayList;

public class Memory
{
    private ArrayList<String> lifeData;

    public Memory()
    {
        lifeData = new ArrayList<>();
    }

    public void addLifeData(String datum)
    {
        lifeData.add(datum);
    }

    public void dumpMemory()
    {
        for (String s: lifeData)
        {
            System.out.println(s);
        }
    }
}
