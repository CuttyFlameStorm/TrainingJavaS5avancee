package pacLesPions;

import pacLesInterfaces.I_Affichable;

public class PionOthello implements I_Affichable {
    private char symbole; // Le symbole du pion Othello, par exemple '🚫' ou '⚙️' ou '☢️' ou '☣️' ou '⭕️' ou '❌'
    // ou '♟' ou '♙' ou '♘' ou '♗' ou '♖'  ou '♕' ou '♔' ou '♞' ou '♝' ou '♜' ou '♛' ou '♚' ou '⚈' ou '⚆'

    public PionOthello(char symbole) {
        this.symbole = symbole;
    }

    @Override
    public char getSymbole() {
        return symbole;
    }
}

