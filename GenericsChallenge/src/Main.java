public class Main {
    public static void main(String[] args) {

        League<Team<FotballPlayer>> fotballLeague = new League<>("AFL");

        Team<FotballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FotballPlayer> melbourne = new Team<>("Melbourne");
        Team<FotballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FotballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        fotballLeague.add(adelaideCrows);
        fotballLeague.add(melbourne);
        fotballLeague.add(hawthorn);
        fotballLeague.add(fremantle);

//        fotballLeague.add(baseballTeam);
        fotballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        fotballLeague.add(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning
    }
}