 
/**
 * Models a voting district.
 *
 * @author gcschmit
 * @version 14 June 2022
 */
public class District
{
    private int districtNumber;
    private int democratVotes;
    private int republicanVotes;
    public District(int initialDistrictNumber, int initialDemocratVotes, int initialRepublicanVotes){
        this.districtNumber = initialDistrictNumber;
        this.democratVotes = initialDemocratVotes;
        this.republicanVotes = initialRepublicanVotes;
    }
    
    public int getDemocratVotes(){
        return this.democratVotes;
    }
    
    public int getRepublicanVotes(){
        return this.republicanVotes;
    }
}
