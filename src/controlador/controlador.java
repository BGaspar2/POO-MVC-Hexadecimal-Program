package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import modelo.NumeroDecimal;
import vista.Formulario;

public class controlador {
	NumeroDecimal model = new NumeroDecimal();
	Formulario view = new Formulario();

	public controlador(Formulario view, NumeroDecimal model) {
		super();
		this.view = view;
		this.model = model;

		// event
		this.view.btnOctal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				view.btnHexa.setEnabled(true);
			}
		});
		this.view.btnHexa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				view.btnNuevo.setEnabled(true);
			}
		});
		this.view.btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				view.btnOctal.setEnabled(false);
				view.btnHexa.setEnabled(false);
				view.btnNuevo.setEnabled(false);
				view.txtRes.setText("0");
				view.txtNum.setText("0");
			}
		});
		this.view.btnBinario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				view.btnOctal.setEnabled(true);
			}
		});
		this.view.btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model.setNumeroOctal(Integer.parseInt(view.txtNum.getText()));
				if(Integer.parseInt(view.txtNum.getText()) < 0 ) {
					JOptionPane.showMessageDialog(null, "EL valor ingresado tiene que ser Entero y Positivo");
				}else {
				model.convertirDecimalAOctal(model.getNumeroOctal());
				view.txtRes.setText(String.valueOf(model.getNumeroOctal()));
				}
			}

		});
		this.view.btnHexa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model.setNumeroHexadecimal(Integer.parseInt(view.txtNum.getText()));
				if(Integer.parseInt(view.txtNum.getText()) < 0 ) {
					JOptionPane.showMessageDialog(null, "EL valor ingresado tiene que ser Entero y Positivo");
				}else {
				model.decimalAHexadecimal(model.getNumeroHexadecimal());
				view.txtRes.setText(String.valueOf(model.getNumeroHexadecimal()));
				}
			}

		});
		this.view.btnBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model.setNumeroBinario(Integer.parseInt(view.txtNum.getText()));
				if(Integer.parseInt(view.txtNum.getText()) < 0 ) {
					JOptionPane.showMessageDialog(null, "EL valor ingresado tiene que ser Entero y Positivo");
				}else {
				model.convertirDecimalABinario(model.getNumeroBinario());
				view.txtRes.setText(String.valueOf(model.getNumeroBinario()));
				}
			}

		});

	}

	public void iniciar() {
		view.setTitle("Progrma conversion decimal");
		view.setLocationRelativeTo(view);
	}
}
