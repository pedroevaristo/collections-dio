package List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int loop_do_while = 1;
        int chosen;
        String task;

        while (loop_do_while != 0){
            System.out.println("O que vc quer fazer ? 1-add, 2-remove,3-showTotalNumbersTask, 4-show");
            chosen = scan.nextInt();
            scan.nextLine();


            switch(chosen){
                case 1:
                    System.out.println("Adicione");
                    task = scan.nextLine();
                    list.add(task);
                    break;
                case 2:
                    System.out.println("Removendo qual ?");
                    task = scan.nextLine();
                    if(list.contains(task)) {
                        System.out.println("Tarefa removida");

                    }else {
                        System.out.println("Não existe na lista");
                    }
                    break;
                case 3:
                    int numbers = list.size();
                    System.out.println("Numero total de tarefas " + numbers);
                    break;
                case 4:
                    for(int i = 0; i < list.size(); i++){
                        System.out.println((i + 1)+ " : " + list.get(i));
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + chosen);
            }
        }

    }
}
