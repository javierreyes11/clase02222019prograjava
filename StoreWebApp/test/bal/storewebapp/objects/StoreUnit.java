
package bal.storewebapp.objects;


public class StoreUnit {

    public StoreUnit(String p_StrName, int p_iPrice, int p_iQuantity) {
        m_StrName = p_StrName;
        m_iPrice = p_iPrice;
        m_iQuantity = p_iQuantity;
    }
    
    
    private String m_StrName;
    private int m_iPrice;
    private int m_iQuantity;

    public String getName() {
        return m_StrName;
    }

    public void setName(String p_StrName) {
        m_StrName = p_StrName;
    }

    public int getPrice() {
        return m_iPrice;
    }

    public void setPrice(int p_iPrice) {
        m_iPrice = p_iPrice;
    }

    public int getQuantity() {
        return m_iQuantity;
    }

    public void setQuantity(int p_iQuantity) {
        m_iQuantity = p_iQuantity;
    }
    public int getCost()
    {
    int iPrice=getPrice();
    int iQuantity=getPrice();
    int iResult = iPrice*iQuantity;
    return iResult;
    
    }        
     
    
}
