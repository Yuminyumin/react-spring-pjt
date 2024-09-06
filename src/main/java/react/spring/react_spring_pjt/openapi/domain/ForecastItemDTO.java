package react.spring.react_spring_pjt.openapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastItemDTO {
    @JsonProperty("beachNum")
    private int beachNum;

    @JsonProperty("baseDate")
    private String baseDate;

    @JsonProperty("baseTime")
    private String basTime;

    @JsonProperty("category")
    private String category;

    @JsonProperty("fcstDate")
    private String fcstDate;

    @JsonProperty("fcstTime")
    private String fcstTime;

    @JsonProperty("fcstValue")
    private String fcstValue;

    @JsonProperty("nx")
    private String nx;

    @JsonProperty("ny")
    private String ny;

    private String categoryName;
}
