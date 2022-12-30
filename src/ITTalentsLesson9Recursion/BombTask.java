package ITTalentsLesson9Recursion;

public class BombTask {
    public static void main(String[] args) {
        char[][] room={
                {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'},
                {'*',' ',' ','*',' ',' ',' ',' ',' ',' ','*',' ',' ',' ',' ','*',},
                {'*',' ',' ','*',' ',' ',' ',' ',' ',' ','*',' ',' ',' ',' ','*',},
                {'*',' ',' ','*',' ',' ',' ',' ',' ',' ','*',' ',' ',' ',' ','*',},
                {'*',' ',' ','*',' ',' ',' ',' ',' ',' ','*','*',' ','*','*','*',},
                {'*',' ',' ','*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',},
                {'*','*','*','*',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*','*','*','*','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',' ',' ',' ','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',' ',' ',' ','*',},
                {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*',' ',' ',' ','*',},
                {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}
        };
        int bombI=6;
        int bombJ=6;
        gasIt(room,bombI,bombJ);
        print(room);
    }
    static void gasItEvenMore(char[][] masiv,int i, int j ){
        if(masiv[i][j]==' '){
            masiv[i][j]='+';
            gasItEvenMore(masiv,i,j-1);
            gasItEvenMore(masiv,i,j+1);
            gasItEvenMore(masiv,i+1,j);
            gasItEvenMore(masiv,i-1,j);
        }
    }
    static void gasIt(char [][] masiv,int i,int j){
        if(masiv[i][j-1]==' '){
            masiv[i][j-1]='+';
            gasIt(masiv,i,j-1);
        }
        if(masiv[i][j+1]==' '){
            masiv[i][j+1]='+';
            gasIt(masiv,i,j+1);
        }
        if(masiv[i-1][j]==' '){
            masiv[i-1][j]='+';
            gasIt(masiv,i-1,j);
        }
        if(masiv[i+1][j]==' '){
            masiv[i+1][j]='+';
            gasIt(masiv,i+1,j);
        }
    }
    static void print(char masiv[][]){
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                System.out.print(masiv[i][j]);
            }
            System.out.println();
        }
    }
}
