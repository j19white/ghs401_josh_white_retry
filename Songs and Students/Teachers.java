

public class Teachers
{
    public String name;
    private int years;
    
    public Teachers(String name, int years)
    {
        this.name = name;
        this.years = years;
        
        
    }
    public int numVowelsInName()
    {
        int numVowels=0;
        for(int i=0; i<this.name.length(); i++)
        {
            if(this.name.substring(i, i+1).equals("a") || this.name.substring(i, i+1).equals("e") ||this.name.substring(i, i+1).equals("i") ||this.name.substring(i, i+1).equals("o") ||this.name.substring(i, i+1).equals("u"))
            {
                numVowels++;
                
            }
        }
        return numVowels;
        
    }
    public int getYears()
    {
        return this.years;
        
    }
    public void setYears(int years)
    {
        this.years = years;
        
    }
    public String toString()
    {
        return "Name: " + this.name + " Years: " + this.years + "    Vowels: " + this.numVowelsInName();
        
    }
}
