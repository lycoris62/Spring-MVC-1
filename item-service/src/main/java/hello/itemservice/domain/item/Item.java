package hello.itemservice.domain.item;

import lombok.Data;

@Data // 위험해!
//@Getter @Setter // 원래는 필요한 것들만!
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
