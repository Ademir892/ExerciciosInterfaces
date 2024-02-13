package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private double amount;
	
	public Installment() {
	}
	
	public Installment(LocalDate date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getdate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	
}
