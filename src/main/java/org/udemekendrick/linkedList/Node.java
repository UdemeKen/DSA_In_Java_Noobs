package org.udemekendrick.linkedList;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 9/17/2024
 */
public class Node {
    public Integer data;
    public Node next;

    public Node(Integer data){
        this.data = data;
        next = null;
    }
}
