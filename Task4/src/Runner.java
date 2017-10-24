import java.util.Arrays;

public class Runner {

    private String name;
    private int time;

    public Runner() {    }

    public Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public static Runner[] SortRunners(Runner[] runners)
    {
        for (int i = runners.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (runners[j].time > runners[j + 1].time ) {
                    Runner temp = runners[j];
                    runners[j] = runners[j + 1];
                    runners[j + 1] = temp;
                }
            }
        }
        return runners;
    }

    public void RunnerInfo() {
        System.out.println(name + " " + time);
    }

    public Runner InfoByPosition(Runner[] runners, int pos)
    {
        Runner.SortRunners(runners);
        return runners[pos];
    }

    public Runner MarathonWinner(Runner[] runners)
    {
        Runner.SortRunners(runners);
        return runners[0];
    }
}