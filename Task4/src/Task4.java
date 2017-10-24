import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)    {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        Runner[] runners = new Runner[16];
        Runner runnerbyplace = new Runner();
        Runner winner = new Runner();

        for (int i = 0; i < names.length; i++) {
            runners[i] = new Runner(names[i], times[i]);
        }

        runners = Runner.SortRunners(runners);
        for(int i = 0; i < runners.length; i++)
            runners[i].RunnerInfo();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите позицию бегуна:");
        String str = scan.next();
        int pos = Integer.parseInt(str)-1;
        System.out.println("Бегун занявший " + (pos+1) + " место:");
        runnerbyplace = runnerbyplace.InfoByPosition(runners,pos);
        runnerbyplace.RunnerInfo();

        System.out.println("Победитель марафона:");
        winner = winner.MarathonWinner(runners);
        winner.RunnerInfo();
    }
}