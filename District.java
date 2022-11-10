
/**
 * Models a voting district.
 *
 * @author gcschmit
 * @version 14 June 2022
 */
public class District
{
    private int districtNumber;
    private int democraticVotes;
    private int republicanVotes;
    public District(int initialDistrictNumber, int initialDemocraticVotes, int initialRepublicanVotes){
        this.districtNumber = initialDistrictNumber;
        this.democraticVotes = initialDemocraticVotes;
        this.republicanVotes = initialRepublicanVotes;
    }
    
    public int getDemocratVotes(){
        return this.democraticVotes;
    }
    
    public int getRepublicanVotes(){
        return this.democraticVotes;
    }
}
