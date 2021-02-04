package artik.by;

import java.util.Random;
import java.util.Scanner;

public class Optional_task_2_4 {
    public Optional_task_2_4() {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.next());
        scanner.close();
        int[][] matrix=new int[n][n];
        Random random = new Random(24);                 //  delete the argument

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=random.nextInt(24);
                if(random.nextBoolean()){
                    matrix[i][j]*=-1;
                }
                if(i==0&&j==0){
                    max=matrix[0][0];
                }
                else {
                    if(matrix[i][j]>max){
                        max=matrix[i][j];
                    }
                }
            }
        }

        for(int[]line:matrix){
            for(int el:line){
                System.out.print(el+"\t\t");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        boolean[][] elementsToDelete=new boolean[n][n];
        for(boolean[]line:elementsToDelete){
            for(boolean el:line){
                el=false;
            }
        }

        int deletedLines=0;
        int deletedColumns=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==max){
                    for(int i1=0;i1<n;i1++){
                        boolean isNotDeleted=true;
                        if(isNotDeleted && !elementsToDelete[i1][j]){
                            isNotDeleted=false;
                        }
                        elementsToDelete[i1][j]=true;
                    }
                    for(int j1=0;j1<n;j1++){
                        boolean isNotDeleted=true;
                        if(isNotDeleted && !elementsToDelete[i][j1]){
                            isNotDeleted=false;
                        }
                        elementsToDelete[i][j1]=true;
                    }
                    deletedColumns++;
                    deletedLines++;
                }
            }
        }

        int[][]res=new int[n-deletedLines][n-deletedColumns];

        int i2=0,j2=0;
        for(int i1=0;i1<n;i1++){
            boolean notEmptyLine=false;
            for(int j1=0;j1<n;j1++){
                if(!elementsToDelete[i1][j1]){
                    notEmptyLine=true;
                    res[i2][j2++]=matrix[i1][j1];
                }
            }
            if(notEmptyLine){
                i2++;
            }
            j2=0;
        }

        for(int[]line:res){
            for(int el:line){
                System.out.print(el+"\t\t");
            }
            System.out.println();
        }



    }
}
