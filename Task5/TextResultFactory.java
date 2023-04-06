/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

public class TextResultFactory implements FactoryMethod {

    /**
     *
     * @return
     */
    @Override
    public ResultFormatter createResultFormatter() {
        return new TextResultFormatter();
    }
}