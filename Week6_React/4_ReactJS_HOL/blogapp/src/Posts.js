import { Component } from 'react';

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(res => res.json())
            .then(data => {
                this.setState({ posts: data });
            })
            .catch(err => {
                console.error("Failed to fetch posts", err);
                this.setState({ hasError: true });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert('An error occurred while rendering posts.');
        console.error("Error caught in componentDidCatch:", error, info);
    }

    render() {
        if (this.state.hasError) {
            return <h1>Something went wrong.</h1>;
        }

        return (
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: '20px', padding: '10px', border: '1px solid #ccc' }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;