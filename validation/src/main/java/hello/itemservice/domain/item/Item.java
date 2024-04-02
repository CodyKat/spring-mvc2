package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {
//
//    @NotNull(groups = UpdateCheck.class)
//    private Long id;
//
//    @NotBlank(message = "공백은 입력할 수 없습니다.", groups = {SaveCheck.class, UpdateCheck.class})
//    private String itemName;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min = 1000, max = 1000000)
//    private Integer price;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = SaveCheck.class)
//    private Integer quantity;


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

    public interface SaveCheck {

    }

    public interface UpdateCheck {

    }
}
