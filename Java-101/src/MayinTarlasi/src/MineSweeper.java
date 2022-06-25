import java.util.Scanner;

public class MineSweeper {
    private int rowNumber;
    private int colNumber;
    private int numberOfMines;
    private String[][] gameBoard;
    private String[][] minesBoard;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        numberOfMines = rowNumber * colNumber / 4;
    }

    public void createGameBoard() {
        System.out.println("Mayın Tarlası Oyunu'na Hoş Geldiniz!");
        gameBoard = new String[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                gameBoard[i][j] = "- ";
            }
        }
    }

    public void putMines() {
        minesBoard = new String[rowNumber][colNumber];

        for (int i = 0; i < numberOfMines; i++) {
            int randomRowNumber = (int) (Math.random() * rowNumber);
            int randomColNumber = (int) (Math.random() * colNumber);
            if (minesBoard[randomRowNumber][randomColNumber] == null)
                minesBoard[randomRowNumber][randomColNumber] = "* ";
            else
                i--;
        }

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (minesBoard[i][j] == null)
                    minesBoard[i][j] = "- ";
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        putMines();
        printMinesBoard();
        createGameBoard();
        int loop = rowNumber * colNumber - numberOfMines;
        int i = 0;
        while (i < loop) {
            printGameBoard();
            System.out.print("Satır Giriniz: ");
            int rowSelection = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int colSelection = scanner.nextInt();
            System.out.println("===========================");
            if (rowSelection < 1 || rowSelection > rowNumber || colSelection < 1 || colSelection > colNumber) {
                System.out.println("Geçersiz Koordinat!");
                System.out.println("===========================");
                continue;
            }
            if (minesBoard[rowSelection - 1][colSelection - 1].equals("* ")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }
            if (!minesBoard[rowSelection - 1][colSelection - 1].equals("- "))
                i--;
            i++;
            int count = 0;
            if (checkBounds(rowSelection, colSelection + 1)) {
                if (minesBoard[rowSelection - 1][colSelection].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection + 1, colSelection + 1)) {
                if (minesBoard[rowSelection][colSelection].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection - 1, colSelection + 1)) {
                if (minesBoard[rowSelection - 2][colSelection].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection + 1, colSelection)) {
                if (minesBoard[rowSelection][colSelection - 1].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection - 1, colSelection - 1)) {
                if (minesBoard[rowSelection - 2][colSelection - 2].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection, colSelection - 1)) {
                if (minesBoard[rowSelection - 1][colSelection - 2].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection - 1, colSelection)) {
                if (minesBoard[rowSelection - 2][colSelection - 1].equals("* "))
                    count++;
            }
            if (checkBounds(rowSelection + 1, colSelection - 1)) {
                if (minesBoard[rowSelection][colSelection - 2].equals("* "))
                    count++;
            }
            gameBoard[rowSelection - 1][colSelection - 1] = count + " ";
        }
        printGameBoard();
        System.out.println("Tebrikler Kazandınız!");
    }

    public boolean checkBounds(int rowSel, int colSel) {
        return rowSel >= 1 && colSel >= 1 && rowSel <= rowNumber && colSel <= colNumber;
    }

    public void printGameBoard() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public void printMinesBoard() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(minesBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
