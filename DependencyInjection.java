class DebitCard implements IPay
{
    public DebitCard()
    {
        System.out.println("Debit card is instantiated");
    }
    public boolean payBill(double amount)
    {
        System.out.println("Payment is processed through debit card and amount is paid is :" +amount);
        return true;

    }
}

class CreditCard implements IPay
{
    public CreditCard()
    {
        System.out.println("credit card is instantiated");
    }
    public boolean payBill(double amount)
    {
        System.out.println("Payment is processed through credit card and amount is paid is :" +amount);
        return true;

    }
}

class QRCode implements IPay
{
    public QRCode()
    {
        System.out.println("QR code is instantiated");
    }
    public boolean payBill(double amount)
    {
        System.out.println("Payment is processed through QR code and amount is paid is :" +amount);
        return true;

    }
}

// class PaymentProcess //tightly coupled with debit,credit and QR classes
// {
//     public boolean doPayment(double amount)
//     {
//         DebitCard db = new DebitCard();
//         db.payBill(amount);

//         CreditCard cd = new CreditCard();
//         cd.payBill(amount); 

//         QRCode  qr = new QRCode();
//         qr.payBill(amount);

//         return true;
//     }
// }

class PaymentProcess 
{
    private IPay pay;
    public void setPay(IPay pay) 
    {
        this.pay = pay;
    }

    //Constructor Injection
    public PaymentProcess(IPay pay)
    {
        super();
        this.pay = pay;
    }
    

    public boolean doPayment(double amount)
    {
        boolean status = pay.payBill(amount);

        System.out.println(status ? ("payment success") : ("payment failed"));
        // if(status)
        // {
        //     System.out.println("payment success");
        // }
        // else
        // {
        //     System.out.println("payment failed");
        // }

        return true;
    }


    
}

interface IPay
{
    boolean payBill(double amount);
    
}

public class DependencyInjection
{
    public static void main(String[] args) 
    {
        PaymentProcess pp= new PaymentProcess();

        // DebitCard db = new DebitCard();
        // pp.setPay(db);
        pp.setPay(new DebitCard()); //Injecting dependency through setter is called setter injection 
        pp.doPayment(120.9);

        //constructor injection
        //PaymentProcess pp= new PaymentProcess(new DebitCard());

        pp.setPay(new CreditCard());
        pp.doPayment(110.9);

        pp.setPay(new QRCode());
        pp.doPayment(10.9);
    }
    
}



