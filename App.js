import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
    const [articles, setArticles] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/news')
            .then(response => setArticles(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h1>Top Headlines</h1>
            {articles.map(article => (
                <div key={article.id}>
                    <h3>{article.title}</h3>
                    <p>{article.description}</p>
                    <a href={article.url} target="_blank" rel="noopener noreferrer">Read more</a>
                </div>
            ))}
        </div>
    );
}

export default App;
