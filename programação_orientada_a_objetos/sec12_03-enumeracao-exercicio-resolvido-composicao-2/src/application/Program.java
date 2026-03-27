package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow! That's awesome!");

		Post p1 = new Post(sdf.parse("27/03/2026 09:58:37"), "Traveling to New Zeland",
				"I'm going to visit this wonderful country!", 13);
		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you!");

		Post p2 = new Post(sdf.parse("27/03/2026 09:58:37"), "Good night guys!", "See you tomorrow!", 127);
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);

		sc.close();

	}

}
