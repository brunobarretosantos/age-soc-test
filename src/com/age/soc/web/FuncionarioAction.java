package com.age.soc.web;

import java.util.List;
import com.age.soc.dao.FuncionarioDAO;
import com.age.soc.model.Funcionario;
import com.opensymphony.xwork2.ActionSupport;

public class FuncionarioAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Funcionario funcionario;
    private List<Funcionario> listaFuncionarios;
    private FuncionarioDAO funcionarioDAO;

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public String adicionarFuncionario() {
        try {
            funcionarioDAO.adicionarFuncionario(funcionario);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public String listarFuncionarios() {
        try {
            listaFuncionarios = funcionarioDAO.listarFuncionarios();
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}