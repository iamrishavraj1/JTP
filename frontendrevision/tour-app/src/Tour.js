import { useState } from "react";
const Tour = ({ id, name, info, image, price }) => {
  const [readMore, setReadMore] = useState(false);
  return (
    <>
      <main>
        <h1>{name}</h1>
        <p>
          {readMore ? info : `${info.substring(0, 200)}...`}
          <button onClick={() => setReadMore(!readMore)}>
            {!readMore ? `Read More` : `Show Less`}
          </button>
        </p>
        <img src={image} alt={name} />
      </main>
    </>
  );
};

export default Tour;
