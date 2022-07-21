const List = ({ people }) => {
  return (
    <>
      <div>
        {people.map((item) => {
          const { id, name, age, image } = item;
          return (
            <>
              <article key={id} className="person">
                <img src={image} alt={name} />
                <div>
                  <h4>{name}</h4>
                  <p>{age} years</p>
                </div>
              </article>
            </>
          );
        })}
      </div>
    </>
  );
};

export default List;
