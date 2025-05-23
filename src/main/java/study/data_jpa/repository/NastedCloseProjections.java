package study.data_jpa.repository;

public interface NastedCloseProjections {

    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo {
        String getName();
    }
}
