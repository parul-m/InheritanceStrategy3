package dto;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contract_EMP")
@PrimaryKeyJoinColumn(name = "id")
public class Contract_emp extends Employee{
    float pay_perhr;
    float days;

    public Contract_emp() {
    }

    public float getPay_perhr() {
        return pay_perhr;
    }

    public void setPay_perhr(float pay_perhr) {
        this.pay_perhr = pay_perhr;
    }

    public float getDays() {
        return days;
    }

    public void setDays(float days) {
        this.days = days;
    }
}
