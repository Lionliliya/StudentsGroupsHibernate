package company;

import javax.persistence.*;

@Entity
@Table(name="Clients")
@DiscriminatorValue(value="V")
public class VipClient extends Client{
    @Column(name="card_number")
    private String cardNumber; // номер вип карты :)

    public VipClient() {}

    public VipClient(String name, String email, String phone, String cardNumber) {
        super(name, email, phone);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
