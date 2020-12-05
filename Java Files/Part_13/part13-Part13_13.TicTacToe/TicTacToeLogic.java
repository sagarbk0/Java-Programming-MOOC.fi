/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.scene.control.Button;

/**
 *
 * @author Sagar Bhatt
 */
public class TicTacToeLogic {
    private String currentUser;
    private boolean end;
    
    public TicTacToeLogic(String initialUser) {
        this.currentUser = initialUser;
        this.end = false;
    }
    
    public void changeCurrentUser() {
        if(this.currentUser.equals("O")) {
            this.currentUser = "X";
        } else {
            this.currentUser = "O";
        };
    }
    
    public String getCurrentUser () {
        return this.currentUser;
    }
    
    public void setEnd() {
        this.end = true;
    }
    
    public boolean getEnd() {
        return this.end;
    }
    
    public String findWinningPairs(Button[][] buttons, char[][] numsO, 
            char[][] numsX) {
        
        String setText = "";
        
        int oDiag0 = 0;
        int xDiag0 = 0;
        int oDiag1 = 0;
        int xDiag1 = 0;

        for(int m=0; m<3; m++) {
            int oHor = 0;
            int oVer = 0;
            int xHor = 0;
            int xVer = 0;


            for(int n=0; n<3; n++) {
                if(numsO[m][n] == 'y') {
                    oVer ++;
                }
                if(numsO[n][m] == 'y') {
                    oHor ++;
                }
                if(numsX[m][n] == 'y') {
                    xVer ++;
                }
                if(numsX[n][m] == 'y') {
                    xHor ++;
                }

                if(n == m) {
                    if(numsO[n][m] == 'y') {
                        oDiag0 ++;
                    }
                    if(numsX[n][m] == 'y') {
                        xDiag0 ++;
                    }
                }

                if(n + m == 2) {
                    if(numsO[n][m] == 'y') {
                        oDiag1 ++;
                    }
                    if(numsX[n][m] == 'y') {
                        xDiag1 ++;
                    }
                }
            }

            if(oHor == 3 || oVer == 3 || xHor == 3 || xVer == 3) {
                setText = "The end!";
                setEnd();
            }
        }

        if(oDiag0 == 3 || oDiag1 == 3 || xDiag0 == 3 || xDiag1 == 3) {
            setText = "The end!";
            setEnd();
        }
        
        return setText;
    }
}
