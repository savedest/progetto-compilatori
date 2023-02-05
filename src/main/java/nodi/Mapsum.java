package nodi;

import Visitor.Visitatore;

import java.util.ArrayList;

public class Mapsum extends Node {

    public String nomeNodo;

    public IdVal id2;
    public ArrayList<ExprNode> exprNodes1;
    public   ArrayList<ExprNode> exprNodes2;
    public ArrayList<ExprNode> exprNodes3;
    public String typeNode;

    public Mapsum(String nomeNodo,  IdVal idval,ArrayList<ExprNode> exprNodes1, ArrayList<ExprNode> exprNodes2, ArrayList<ExprNode> exprNodes3) {
        this.nomeNodo = nomeNodo;

        this.id2 = idval;
        this.exprNodes1 = exprNodes1;
        this.exprNodes2 = exprNodes2;
        this.exprNodes3 = exprNodes3;

    }

    public Object accept(Visitatore v) {
        return v.visit(this);
    }
}