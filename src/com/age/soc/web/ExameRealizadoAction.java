package com.age.soc.web;

import java.util.List;
import com.age.soc.dao.ExameRealizadoDAO;
import com.age.soc.model.Exame;
import com.age.soc.model.ExameRealizado;
import com.age.soc.model.Funcionario;
import com.opensymphony.xwork2.ActionSupport;

public class ExameRealizadoAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ExameRealizado exameRealizado;
    private List<ExameRealizado> listaExamesRealizados;
    private List<Funcionario> listaFuncionarios;
    private List<Exame> listaExames;
    private ExameRealizadoDAO exameRealizadoDAO;

    public void setExameRealizado(ExameRealizado exameRealizado) {
        this.exameRealizado = exameRealizado;
    }

    public ExameRealizado getExameRealizado() {
        return exameRealizado;
    }

    public List<ExameRealizado> getListaExamesRealizados() {
        return listaExamesRealizados;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public List<Exame> getListaExames() {
        return listaExames;
    }

    public void setExameRealizadoDAO(ExameRealizadoDAO exameRealizadoDAO) {
        this.exameRealizadoDAO = exameRealizadoDAO;
    }

    public String adicionarExameRealizado() {
        try {
            exameRealizadoDAO.adicionarExameRealizado(exameRealizado);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public String listarExamesRealizados() {
        try {
            listaExamesRealizados = exameRealizadoDAO.listarExamesRealizados();
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}