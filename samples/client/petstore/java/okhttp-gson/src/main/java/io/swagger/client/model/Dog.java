/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\ 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Animal;

import com.google.gson.annotations.SerializedName;


/**
 * Dog
 */
public class Dog extends Animal  {
    @SerializedName("className")
    private String className = null;
    @SerializedName("color")
    private String color = "red";
    @SerializedName("breed")
    private String breed = null;

    /**
     * Get className
     * @return className
     **/
    @ApiModelProperty(required = true, value = "")
    public String getClassName() {
        return className;
    }

    /**
     * Set className
     *
     * @param className className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Get color
     * @return color
     **/
    @ApiModelProperty(value = "")
    public String getColor() {
        return color;
    }

    /**
     * Set color
     *
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get breed
     * @return breed
     **/
    @ApiModelProperty(value = "")
    public String getBreed() {
        return breed;
    }

    /**
     * Set breed
     *
     * @param breed breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(this.className, dog.className) &&
        Objects.equals(this.color, dog.color) &&
        Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, color, breed, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dog {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

