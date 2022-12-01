public class Competition {

    public static void main(String[] args){
        CompetitionRules printAllRules = new CompetitionRules();

        printAllRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "The Junior ";
        teamB.teamName = "The Senior ";

        //Dettagli programmatori teamA "The Junior"
        teamA.p1.name = "Giorgio ";
        teamA.p1.yearsOfExperience = 2;
        teamA.p1.programmingLanguage = "Java ";

        teamA.p2.name = "Luigi ";
        teamA.p2.yearsOfExperience = 1;
        teamA.p2.programmingLanguage = "Java ";

        //Dettagli programmatori teamB "The Senior "
        teamB.p1.name = "Mario ";
        teamB.p1.yearsOfExperience = 10;
        teamB.p1.programmingLanguage = "Javascript ";

        teamB.p2.name = "Giovanni ";
        teamB.p2.yearsOfExperience = 12;
        teamB.p2.programmingLanguage = "Javascript ";

        teamA.p1.printProgrammerDetails();
        teamA.p2.printProgrammerDetails();

        teamB.p1.printProgrammerDetails();
        teamB.p2.printProgrammerDetails();

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }


    }