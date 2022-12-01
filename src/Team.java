public class Team {
    String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println(p1);
        System.out.println(p2);
    }
}
