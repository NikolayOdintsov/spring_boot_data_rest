package rest_data.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by nikolay.odintsov on 18/04/16.
 */
public class Product {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String imageUrl;

    @Getter
    @Setter
    private double price;
}
