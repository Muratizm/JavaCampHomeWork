public class Songs {

    private String groupName;
    private String songName;


    public Songs() {

    }

    public Songs(String groupName, String songName) {
        super();
        this.groupName = groupName;
        this.songName = songName;

    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {

        this.groupName = groupName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {

        this.songName = songName;

    }


}
