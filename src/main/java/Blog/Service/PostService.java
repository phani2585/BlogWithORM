package Blog.Service;

import Blog.Model.Post;
import Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public PostService(){
        System.out.println("***Post Service ***");
    }
    public List<Post> getAllPosts() {
        /*ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("This is the body of the Post 1 ");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("This is the body of the Post 2 ");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("This is the body of the Post 3 ");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);*/


        return postRepository.getAllPosts();
    }
   /* public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }*/

    public void createPost(Post newPost) {
        newPost.setDate(new Date());
        postRepository.createPost(newPost);
        System.out.println("New Post"+newPost);
    }

    public Post getPost(Integer postId) {
        return postRepository.getPost(postId);
    }

    public void updatePost(Post updatedPost) {
        updatedPost.setDate(new Date());
        postRepository.updatePost(updatedPost);
    }
    public void deletePost(Integer postId) {
        postRepository.deletePost(postId);
    }
}
