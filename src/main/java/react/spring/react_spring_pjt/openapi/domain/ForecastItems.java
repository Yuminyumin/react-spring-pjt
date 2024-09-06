package react.spring.react_spring_pjt.openapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Data
@AllArgsConstructor
public class ForecastItems {

    @JsonProperty("item")
    private List<ForecastItemDTO> items;

    @JsonCreator
    public ForecastItems(@JsonProperty("response") JsonNode node){
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode itemNode = node.findValue("item");

            this.items = Arrays.stream(mapper.treeToValue(itemNode, ForecastItemDTO[].class)).toList();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
