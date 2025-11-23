import java.util.Scanner ;

public class Lab114 {
    public static void main(String[] text){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row  :");
        int row = input.nextInt();
        System.out.print("Enter Colume");
        int colume = input.nextInt();
        char[][] mapArea = new char[row][colume];
        

        System.out.println("create map bome is '*' saftArea is '.' : " );
        for(int i = 0 ; i < row ; i++){
           for(int j = 0 ;j < colume ; j++){
           mapArea[i][j]= input.next().charAt(0);
        }
    }

    int coutMine = 0 ;
    for(int i = 0 ; i < row ; i++){
           for(int j = 0 ;j < colume ; j++){
          if( mapArea[i][j] == '*'){
            coutMine ++ ;
          }
        }
    }

        System.out.print("Enter target Row : ");
        int tergetRow = input.nextInt();
        System.out.print("Enter target colume : ");
        int tergetColume = input.nextInt();
        int couter = 0 ;
       

        if(tergetRow < 0 || tergetRow >= row || tergetColume < 0 || tergetColume >= colume){
            System.out.print("1");
            return ;
    }
        
            if(mapArea[tergetRow][tergetColume] ==  '*'){
            couter ++ ;
            System.out.println("Mine!!");

          }
            else{
            if (tergetRow - 1 >= 0 && tergetColume - 1 >= 0) {
                if (mapArea[tergetRow-1][tergetColume-1] == '*'){ 
                    couter++;
                }
            }

            if (tergetRow - 1 >= 0) {
                if (mapArea[tergetRow-1][tergetColume] == '*'){
                    couter++;
                }
            }

            if (tergetRow - 1 >= 0 && tergetColume + 1 < colume) {
                if (mapArea[tergetRow-1][tergetColume+1] == '*'){
                    couter++;
                }
            }

            if (tergetColume - 1 >= 0) {
                if (mapArea[tergetRow][tergetColume-1] == '*'){
                    couter++;
                }
            }

            if (tergetColume + 1 < colume) {
                if (mapArea[tergetRow][tergetColume+1] == '*'){
                    couter++;
                }
            }

            if (tergetRow + 1 < colume && tergetColume - 1 >= 0) {
                if (mapArea[tergetRow+1][tergetColume-1] == '*'){
                    couter++;
                }
            }

            if (tergetRow + 1 < colume) {
                if (mapArea[tergetRow+1][tergetRow] == '*'){
                    couter++;
                }
            }

            if (tergetRow + 1 < row && tergetColume + 1 < colume) {
                if (mapArea[tergetRow+1][tergetColume+1] == '*'){
                    couter++;
                }
            }
            System.out.printf("Have %d Mines Around Area : \n",couter);
      }

    System.out.printf("Total Mines in map = %d\n", coutMine);
   



    }
}
