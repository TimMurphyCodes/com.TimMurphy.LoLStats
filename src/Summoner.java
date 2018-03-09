public class Summoner
{
    private int profileIconId;
    private String name;
    private long summonerLevel;
    private long revisionDate;
    private long id;
    private long accountId;

    public Summoner(int profileIconId, String name, long summonerLevel, long revisionDate, long id, long accountId)
    {
        this.profileIconId = profileIconId;
        this.name = name;
        this.summonerLevel = summonerLevel;
        this.revisionDate = revisionDate;
        this.id = id;
        this.accountId = accountId;
    }

    public int getProfileIconId() { return profileIconId; }

    public String getName() { return name; }

    public long getSummonerLevel() { return summonerLevel; }

    public long getRevisionDate() { return revisionDate; }

    public long getId() { return id; }

    public long getAccountId() { return accountId; }

    @Override
    public String toString() {
        return "Summoner{" +
                "profileIconId=" + profileIconId +
                ", name='" + name + '\'' +
                ", summonerLevel=" + summonerLevel +
                ", revisionDate=" + revisionDate +
                ", id=" + id +
                ", accountId=" + accountId +
                '}';
    }
}
