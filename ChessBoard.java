public class ChessBoard {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}


//*_*_*_*_
//_*_*_*_*
//        *_*_*_*_
//_*_*_*_*
//        *_*_*_*_
//_*_*_*_*
//        *_*_*_*_
//_*_*_*_*
//
//Process finished with exit code 0