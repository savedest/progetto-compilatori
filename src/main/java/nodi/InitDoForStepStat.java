package nodi;

import Visitor.Env;
import Visitor.Visitatore;

import java.util.ArrayList;

public class InitDoForStepStat extends Node {
    public String nomenodo;
    public ExprNode boolExpr;
    public ArrayList<Stat> listaStat;
    public ArrayList<ExprNode> listaExpr;

    public VarDecl varDecl;


    public String typeNode;
    public Env currentEnv;

    public InitDoForStepStat(String nome,VarDecl varDecl, ArrayList<Stat> listaStat,ExprNode node,ArrayList<ExprNode> listaExp){
        this.nomenodo=nome;
        this.varDecl=varDecl;
        this.boolExpr = node;
        this.listaStat=listaStat;
        this.listaExpr =listaExp;
    }

    public Object accept(Visitatore v) {
        return v.visit(this);
    }



}
