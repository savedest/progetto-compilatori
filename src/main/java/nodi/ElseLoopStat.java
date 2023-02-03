package nodi;

import Visitor.Visitatore;

public class ElseLoopStat extends  Node{
    public String nomeNodo;
    public Body body;
    public String typeNode;
    public ExprNode negBool;


    public ElseLoopStat(String nome, Body body) {
        this.nomeNodo = nome;
        this.body = body;
    }
    public Object accept(Visitatore v) {
        return v.visit(this);
    }
}
