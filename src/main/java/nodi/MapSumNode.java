package nodi;

import Visitor.Visitatore;

import java.util.ArrayList;

public class MapSumNode extends Node{
    public String nomeNodo;
    public IdVal id;
    public ArrayList<ExprNode> listaExprNode1;
    public ArrayList<ExprNode> listaExprNode2;
    public ArrayList<ExprNode> listaExprNode3;


    public String typeNode;


    public MapSumNode(String nomeNodo, IdVal id,ArrayList<ExprNode> listaExprNode1,ArrayList<ExprNode> listaExprNode2,ArrayList<ExprNode> listaExprNode3){
        this.nomeNodo = nomeNodo;
        this.id = id;
        this.listaExprNode1 = listaExprNode1;
        this.listaExprNode2 = listaExprNode2;
        this.listaExprNode3 = listaExprNode3;
    }

    public Object accept(Visitatore v){
        return v.visit(this);}
}

