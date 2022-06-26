package net.wodie.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection= "items")
public class FrameItem {

    @Id
    private String id;
    private String displayId;
    private String name;
    private String status;
    private String owner;
}
