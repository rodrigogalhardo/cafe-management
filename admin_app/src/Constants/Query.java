/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constants;

/**
 *
 * @author thienlan
 */
public class Query {
    public static String getFoods = "call USP_Admin_GetFoods()";
    public static String getFoodCategory= "call USP_GetFoodCategories()";
    public static String getTable="call USP_Admin_GetTables()";
     public static String addTable="call USP_InsertTable( @Name )";
}
